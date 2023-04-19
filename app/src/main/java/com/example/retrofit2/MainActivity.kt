package com.example.retrofit2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofit2.API.retrofitService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var btnDetectLanguage: Button
    private lateinit var etDescription: EditText
    private lateinit var progressBar: ProgressBar

    private var languages = emptyList<Language>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initListener()
        getLanguages()

    }

    private fun initListener() {
        btnDetectLanguage.setOnClickListener {
            val text = etDescription.text.toString()
            if (text.isNotEmpty()) {
                detectLanguage(text)
                showLoading()
            } else {
                Toast.makeText(this, "Please enter text", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showLoading() {
        progressBar.visibility = ProgressBar.VISIBLE
    }

    private fun hideLoading() {
        runOnUiThread {
            progressBar.visibility = ProgressBar.GONE
        }
    }


    private fun detectLanguage(text: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val result: Response<DetectionResponse> = retrofitService.detectLanguage(text)
            if (result.isSuccessful) {
                checkResult(result.body())
            } else {
                showError()
            }
        }
    }

    private fun checkResult(body: DetectionResponse?) {
        if (body != null && body.data.detections.isNotEmpty()) {
            val correctLanguage = body.data.detections.filter { it.isReliable }
            if (correctLanguage.isNotEmpty()) {
                val languageName = languages.find { it.code == correctLanguage[0].language }

                if (languageName != null)
                    runOnUiThread {
                        Toast.makeText(
                            this,
                            "El idioma es: " + languageName.name,
                            Toast.LENGTH_SHORT
                        ).show()
                    }
            } else {
                showError()
            }
        } else {
            showError()
        }
        hideLoading()
    }

    private fun getLanguages() {
        CoroutineScope(Dispatchers.IO).launch {
            val languages: Response<List<Language>> = retrofitService.getLanguages()
            if (languages.isSuccessful) {
                this@MainActivity.languages = languages.body() ?: emptyList()
                showSuccess()
            } else {
                showError()
            }
        }
    }

    private fun showSuccess() {
        runOnUiThread {
            Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showError() {
        runOnUiThread {
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initView() {
        btnDetectLanguage = findViewById(R.id.button)
        etDescription = findViewById(R.id.editText)
        progressBar = findViewById(R.id.progressBar)
    }
}
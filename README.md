# Retrofit2


1. Quines versions de llibreries has hagut d'importar?
    - Les següents:
    ```
      implementation 'com.squareup.retrofit2:retrofit:2.9.0'
      implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
      implementation 'com.squareup.okhttp3:logging-interceptor:4.9.1'
      implementation 'com.squareup.okhttp3:okhttp:4.9.1'
      implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'
    ```
2. Quines alternatives hi ha per consumir APIs des d'Android?
    - Hi ha diverses maneres de consumir APIs des d'Android, incloent l'ús de la classe HttpUrlConnection, la llibreria Volley i la llibreria Retrofit.

3. Registra't a a la API pública que es mostra a l'exemple i analitza les diferents peticions que es poden fer amb el Postman.
    1. Detecció individual: això us permet detectar l’idioma d’un sol text mitjançant una sol·licitud POST al endpoint `https://ws.detectlanguage.com/0.2/detect` amb el text com a paràmetre.

    2. Detecció per lots: això us permet detectar l’idioma de diversos textos utilitzant una sola consulta. Això estalvia amplada de banda de xarxa i augmenta significativament el rendiment. Podeu fer una sol·licitud POST a `https://ws.detectlanguage.com/0.2/detect` amb una matriu de textos com a paràmetre.

    3. Estat del compte: això us permet comprovar l’estat del vostre compte mitjançant una sol·licitud GET a `https://ws.detectlanguage.com/0.2/user/status.`

    4. Llista d’idiomes: això us permet recuperar una llista de tots els idiomes compatibles mitjançant una sol·licitud GET al endpoint `https://ws.detectlanguage.com/0.2/languages.`
 
4. Com es fa la crida Get des d'Android?
    - Per fer una crida Get des d'Android amb la llibreria Retrofit, primer s'ha de definir una interfície que descriu la petició Get que es vol fer, i després crear una instància de la classe Retrofit i cridar el mètode creat amb la interfície.
    
5. Per a què serveixen les Coroutines? Quin tipus tenim? Com ens connectem amb altres mètodes del fil principal?
    - Les Coroutines són un mecanisme que es pot utilitzar per gestionar tasques asíncrones de manera segura i eficient. Hi ha diverses maneres de connectar les Coroutines amb altres mètodes del fil principal, incloent la utilització de suspensió de funcions o la creació de tasques de Coroutines en el fil principal.
    
6. Com és l'estructura de dades necessària per emmagatzemar les dades que retorna la API?
    - L'estructura de dades necessària per emmagatzemar les dades que retorna la API depèn de la naturalesa de les dades que es volen emmagatzemar. En aquest cas, el format a seguir es JSON.
    
6. Com funciona la llibreria de log per poder analitzar les crides i respostes que es realitzen a la API?
    - Fent servir Logcat, seria de la següent manera:
    ```
      2023-04-19 16:53:26.838  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  --> GET https://ws.detectlanguage.com/0.2/languages
      2023-04-19 16:53:26.838  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  --> END GET
      2023-04-19 16:53:27.256  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  <-- 200 OK https://ws.detectlanguage.com/0.2/languages (416ms)
      2023-04-19 16:53:27.256  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Content-Type: application/json; charset=utf-8
      2023-04-19 16:53:27.256  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Date: Wed, 19 Apr 2023 14:53:28 GMT
      2023-04-19 16:53:27.256  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Transfer-Encoding: chunked
      2023-04-19 16:53:27.259  9625-9625  AssistStructure         com.example.retrofit2                I  Flattened final assist data: 1180 bytes, containing 1 windows, 6 views
      2023-04-19 16:53:27.262  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  [{"code":"aa","name":"AFAR"},{"code":"ab","name":"ABKHAZIAN"},{"code":"af","name":"AFRIKAANS"},{"code":"ak","name":"AKAN"},{"code":"am","name":"AMHARIC"},{"code":"ar","name":"ARABIC"},{"code":"as","name":"ASSAMESE"},{"code":"ay","name":"AYMARA"},{"code":"az","name":"AZERBAIJANI"},{"code":"ba","name":"BASHKIR"},{"code":"be","name":"BELARUSIAN"},{"code":"bg","name":"BULGARIAN"},{"code":"bh","name":"BIHARI"},{"code":"bi","name":"BISLAMA"},{"code":"bn","name":"BENGALI"},{"code":"bo","name":"TIBETAN"},{"code":"br","name":"BRETON"},{"code":"bs","name":"BOSNIAN"},{"code":"bug","name":"BUGINESE"},{"code":"ca","name":"CATALAN"},{"code":"ceb","name":"CEBUANO"},{"code":"chr","name":"CHEROKEE"},{"code":"co","name":"CORSICAN"},{"code":"crs","name":"SESELWA"},{"code":"cs","name":"CZECH"},{"code":"cy","name":"WELSH"},{"code":"da","name":"DANISH"},{"code":"de","name":"GERMAN"},{"code":"dv","name":"DHIVEHI"},{"code":"dz","name":"DZONGKHA"},{"code":"egy","name":"EGYPTIAN"},{"code":"el","name":"GREEK"},{"code":"en","name":"ENGLISH"},{"code":"eo","name":"ESPERANTO"},{"code":"es","name":"SPANISH"},{"code":"et","name":"ESTONIAN"},{"code":"eu","name":"BASQUE"},{"code":"fa","name":"PERSIAN"},{"code":"fi","name":"FINNISH"},{"code":"fj","name":"FIJIAN"},{"code":"fo","name":"FAROESE"},{"code":"fr","name":"FRENCH"},{"code":"fy","name":"FRISIAN"},{"code":"ga","name":"IRISH"},{"code":"gd","name":"SCOTS_GAELIC"},{"code":"gl","name":"GALICIAN"},{"code":"gn","name":"GUARANI"},{"code":"got","name":"GOTHIC"},{"code":"gu","name":"GUJARATI"},{"code":"gv","name":"MANX"},{"code":"ha","name":"HAUSA"},{"code":"haw","name":"HAWAIIAN"},{"code":"hi","name":"HINDI"},{"code":"hmn","name":"HMONG"},{"code":"hr","name":"CROATIAN"},{"code":"ht","name":"HAITIAN_CREOLE"},{"code":"hu","name":"HUNGARIAN"},{"code":"hy","name":"ARMENIAN"},{"code":"ia","name":"INTERLINGUA"},{"code":"id","name":"INDONESIAN"},{"code":"ie","name":"INTERLINGUE"},{"code":"ig","name":"IGBO"},{"code":"ik","name":"INUPIAK"},{"code":"is","name":"ICELANDIC"},{"code":"it","name":"ITALIAN"},{"code":"iu","name":"INUKTITUT"},{"code":"iw","name":"HEBREW"},{"code":"ja","name":"JAPANESE"},{"code":"jw","name":"JAVANESE"},{"code":"ka","name":"GEORGIAN"},{"code":"kha","name":"KHASI"},{"code":"kk","name":"KAZAKH"},{"code":"kl","name":"GREENLANDIC"},{"code":"km","name":"KHMER"},{"code":"kn","name":"KANNADA"},{"code":"ko","name":"KOREAN"},{"code":"ks","name":"KASHMIRI"},{"code":"ku","name":"KURDISH"},{"code":"ky","name":"KYRGYZ"},{"code":"la","name":"LATIN"},{"code":"lb","name":"LUXEMBOURGISH"},{"code":"lg","name":"GANDA"},{"code":"lif","name":"LIMBU"},{"code":"ln","name":"LINGALA"},{"code":"lo","name":"LAOTHIAN"},{"code":"lt","name":"LITHUANIAN"},{"code":"lv","name":"LATVIAN"},{"code":"mfe","name":"MAURITIAN_CREOLE"},{"code":"mg","name":"MALAGASY"},{"code":"mi","name":"MAORI"},{"code":"mk","name":"MACEDONIAN"},{"code":"ml","name":"MALAYALAM"},{"code":"mn","name":"MONGOLIAN"},{"code":"mr","name":"MARATHI"},{"code":"ms","name":"MALAY"},{"code":"mt","name":"MALTESE"},{"code":"my","name":"BURMESE"},{"code":"na","name":"NAURU"},{"code":"ne","name":"NEPALI"},{"code":"nl","name":"DUTCH"},{"code":"no","name":"NORWEGIAN"},{"code":"nr","name":"NDEBELE"},{"code":"nso","name":"PEDI"},{"code":"ny","name":"NYANJA"},{"code":"oc","name":"OCCITAN"},{"code":"om","name":"OROMO"},{"code":"or","name":"ORIYA"},{"code":"pa","name":"PUNJABI"},{"code":"pl","name":"POLISH"},{"code":"ps","name":"PASHTO"},{"code":"pt","name":"PORTUGUESE"},{"code":"qu","name":"QUECHUA"},{"code":"rm","name":"RHAETO_ROMANCE"},{"code":"rn","name":"RUNDI"},{"code":"ro","name":"ROMANIAN"},{"code":"ru","name":"RUSSIAN"},{"code":"rw","name":"KINYARWANDA"},{"code":"sa","name":"SANSKRIT"},{"code":"sco","name":"SCOTS"},{"code":"sd","name":"SINDHI"},{"code":"sg","name":"SANGO"},{"code":"si","name":"SINHALESE"},{"code":"sk","name":"SLOVAK"},{"code":"sl","name":"SLOVENIAN"},{"code":"sm","name":"SAMOAN"},{"code":"sn","name":"SHONA"},{"code":"so","name":"SOMALI"},{"code":"sq","nam
      2023-04-19 16:53:27.262  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  e":"ALBANIAN"},{"code":"sr","name":"SERBIAN"},{"code":"ss","name":"SISWANT"},{"code":"st","name":"SESOTHO"},{"code":"su","name":"SUNDANESE"},{"code":"sv","name":"SWEDISH"},{"code":"sw","name":"SWAHILI"},{"code":"syr","name":"SYRIAC"},{"code":"ta","name":"TAMIL"},{"code":"te","name":"TELUGU"},{"code":"tg","name":"TAJIK"},{"code":"th","name":"THAI"},{"code":"ti","name":"TIGRINYA"},{"code":"tk","name":"TURKMEN"},{"code":"tl","name":"TAGALOG"},{"code":"tlh","name":"KLINGON"},{"code":"tn","name":"TSWANA"},{"code":"to","name":"TONGA"},{"code":"tr","name":"TURKISH"},{"code":"ts","name":"TSONGA"},{"code":"tt","name":"TATAR"},{"code":"ug","name":"UIGHUR"},{"code":"uk","name":"UKRAINIAN"},{"code":"ur","name":"URDU"},{"code":"uz","name":"UZBEK"},{"code":"ve","name":"VENDA"},{"code":"vi","name":"VIETNAMESE"},{"code":"vo","name":"VOLAPUK"},{"code":"war","name":"WARAY_PHILIPPINES"},{"code":"wo","name":"WOLOF"},{"code":"xh","name":"XHOSA"},{"code":"yi","name":"YIDDISH"},{"code":"yo","name":"YORUBA"},{"code":"za","name":"ZHUANG"},{"code":"zh","name":"CHINESE_SIMPLIFIED"},{"code":"zh-Hant","name":"CHINESE_TRADITIONAL"},{"code":"zu","name":"ZULU"}]
      2023-04-19 16:53:27.262  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  <-- END HTTP (5149-byte body)
      2023-04-19 16:53:27.279  9625-9625  Compatibil...geReporter com.example.retrofit2                D  Compat change id reported: 147798919; UID 10162; state: ENABLED
      2023-04-19 16:53:32.388  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  --> POST https://ws.detectlanguage.com/0.2/detect
      2023-04-19 16:53:32.388  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Content-Type: application/x-www-form-urlencoded
      2023-04-19 16:53:32.388  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Content-Length: 9
      2023-04-19 16:53:32.388  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Authorization: Bearer 4e7342c724cbc79c80550674681da03b
      2023-04-19 16:53:32.388  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  q=Bonjour
      2023-04-19 16:53:32.388  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  --> END POST (9-byte body)
      2023-04-19 16:53:32.616  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  <-- 200 OK https://ws.detectlanguage.com/0.2/detect (227ms)
      2023-04-19 16:53:32.616  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Content-Type: application/json
      2023-04-19 16:53:32.616  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Date: Wed, 19 Apr 2023 14:53:33 GMT
      2023-04-19 16:53:32.616  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  Content-Length: 189
      2023-04-19 16:53:32.616  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  {"data":{"detections":[{"language":"fr","isReliable":true,"confidence":6.65},{"language":"nl","isReliable":false,"confidence":6.65},{"language":"pl","isReliable":false,"confidence":6.65}]}}
      2023-04-19 16:53:32.616  9625-9690  okhttp.OkHttpClient     com.example.retrofit2                I  <-- END HTTP (189-byte body)
    ```

## Autor
### Eduardo Morell


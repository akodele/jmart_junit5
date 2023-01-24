# Автоматизация тестирования. 
# Проект jmart_junit5 для UI-тестирования официального сайта маркетплейса JMart

### Автоматизированные тест-кейсы:
-  Проверка отображения выбранного города Алматы на странице продуктовых магазинов маркетплейса JMart
-  Проверка отображения выбранного города Астана на странице продуктовых магазинов маркетплейса JMart
-  Проверка наличия продуктовых магазинов из списка на сайте JMart в городе Алматы
-  Проверка наличия продуктовых магазинов из списка на сайте JMart в городе Астана
-  Проверка отображения выбранного города на главной странице маркетплейса JMart

## Стек используемых технологии

<p align="center">
<img width="6%" title="Java" src="readme_design/logo/Java.svg">
<img width="6%" title="Selenide" src="readme_design/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="readme_design/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="readme_design/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="readme_design/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="readme_design/logo/JUnit5.svg">
<img width="6%" title="Jenkins" src="readme_design/logo/Jenkins.svg">
<img width="6%" title="Telegram" src="readme_design/logo/Telegram.svg">
</p>

Данный проект реализован на языке Java с использованием системы сборки Gradle.
Для автоматизации тестирования использовались фреймворки Selenide и JUnit5. 
Для удаленного запуска тестов использовалась система Jenkins.
Сами тесты запускались на удаленном сервере Selenoid.
Для отчетности тестов использовались Allure-reports и Telegram-bot.
 
## Запуск тестов

Запустить тесты через терминал можно с помощью команды:
```
gradle clean test
```

#### Имеются следующие ключи для запуска тестов

> -DselenoidUrl <code>адрес удаленного сервера</code>
> 
> -DbrowserSize <code>разрешение запускаемого браузера</code>
>
> -Dbrowser <code>название браузера</code>
> 
> -DbrowserVersion <code>версия браузера</code>

##### Пример команды для запуска тестов (значения в примере являются значениями по умолчанию, поэтому именно эти значения можно не указывать в команде)
```
./gradlew clean test "-DselenoidUrl=https://user1:1234@selenoid.autotests.cloud" "-DbrowserSize=1920x1080" "-Dbrowser=chrome"  "-DbrowserVersion=100.0" 
```

## <img width="4%" title="Jenkins" src="readme_design/logo/Jenkins.svg"> Удаленный запуск тестов в Jenkins

> Для запуска тестов используется параметризированная сборка
<p align="center">
<img title="Jenkins" src="readme_design/screens/Jenkins.png">
</p>

### <img width="4%" title="Allure_Report" src="readme_design/logo/Allure_Report.svg"> Allure-отчет по проведенным тестам
В отчете можно увидеть каие из тестов упали, а какие прошли успешно. Так сохраняются скрин последнего шага, исходный код страницы, логи консоли браузера, а так же видео проведенного тестирования.

<p align="center">
<img title="Allure_suits" src="readme_design/screens/Allure_suits.png">
</p>

## <img width="4%" title="Selenoid" src="readme_design/logo/Selenoid.svg"> Видео проводимого теста

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
<img title="Selenoid_gif" src="readme_design/gifs/Selenoid.gif">
</p>

### <img width="4%" title="Allure_Report" src="readme_design/logo/Allure_Report.svg"> Статистика и состояние проводимых тестов

<p align="center">
<img title="Allure_dashboard" src="readme_design/screens/Allure_dashboard.png">
</p>

## <img width="4%" title="Telegram" src="readme_design/logo/Telegram.svg"> Отправка уведомления в Telegram с использованием бота

> После завершения тестирования специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о тестировании.
> 
> Информация по настройке и использованию бота <code>https://github.com/qa-guru/allure-notifications</code>
<p align="center">
<img title="Telegram_notifications" src="readme_design/screens/Telegram_notifications.png">
</p>



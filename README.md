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

### Локальный запуск тестов

#### Локальный запуск тестов с использованием параметров из property файла test

```
gradle clean test
```

#### Описание параметров для запуска тестов

> -DbrowserName <code>название браузера</code>
> 
> -DbrowserVersion <code>версия браузера</code>
>
> -DbaseUrl <code>url стенда фронта</code>
> 
> -DbrowserSize <code>разрешение браузера</code>
> 
> -DpageLoadTimeout <code>таймоут загрузки страницы</code>
> 
> -Dtimeout <code>таймаут ожидания загрузки элемента страницы</code>
> 
> -Dheadless <code>запуск браузера в обычном или headless режиме</code>
> 
> -DisRemote <code>запуск тестов локально или через remote сервис</code>
> 
> -DremoteUrl <code>url remote сервиса</code>
### Удаленный запуск тестов

#### Удалённый запуск через передачу параметров

<code>gradle clean test -DisRemote=true -DremoteUrl={url}</code>

#### Удалённый запуск через заранее подготовленный property файл

> Создаём property файл с необходимыми параметрами и кладём его в <code>test.resources</code>
>
> Запускаем тесты, используя созданный property файл 
> 
> <code>gradle clean test -Denv={имя файла}</code>
##### Пример файла
```
browserName=chrome
browserVersion=108
baseUrl=https://www.google.com
browserSize=1920x1080
pageLoadTimeout=10000
timeout=10000
headless=false
isRemote=true
remoteUrl=https://selenoid.autotests.cloud
```

## <img width="4%" title="Jenkins" src="readme_design/logo/Jenkins.svg"> Удаленный запуск тестов в Jenkins

> Для запуска тестов используется параметризированная сборка
<p align="center">
<img title="Jenkins" src="readme_design/screens/Jenkins.png">
</p>

## <img width="4%" title="Allure_Report" src="readme_design/logo/Allure_Report.svg"> Главная страница allure отчета

<p align="center">
<img title="Allure_main" src="readme_design/screens/Allure_main.png">
</p>

### <img width="4%" title="Allure_Report" src="readme_design/logo/Allure_Report.svg"> Группировка тестов по проверяемому функционалу

<p align="center">
<img title="Allure_suits" src="readme_design/screens/Allure_suits.png">
</p>

### <img width="4%" title="Allure_Report" src="readme_design/logo/Allure_Report.svg"> Основной дашборд

<p align="center">
<img title="Allure_dashboard" src="readme_design/screens/Allure_dashboard.png">
</p>

## <img width="4%" title="Telegram" src="readme_design/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> После завершения сборки специальный бот, созданный в <code>Telegram</code>, автоматически обрабатывает и отправляет сообщение с отчетом о прогоне.
> 
> Информация по настройке и использованию бота <code>https://github.com/qa-guru/allure-notifications</code>
<p align="center">
<img title="Telegram_notifications" src="readme_design/screens/Telegram_notifications.png">
</p>

## <img width="4%" title="Selenoid" src="readme_design/logo/Selenoid.svg"> Пример запуска теста в Selenoid

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
<img title="Selenoid_gif" src="readme_design/gifs/Selenoid.gif">
</p>

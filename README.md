# lb8

- Роблено клас WeatherMeasurement, що відповідає спостереженню погоди за один день на 
   конкретній станції. Клас має відповідні поля: `date`, `locationId`, `temeperature`, `humidity`, `precipitation`, 
   `windSpeed`.
- Розроблено класи MeasurementLocation та LocationsContainer
   для зіставлення ID станції з її положенням та назвою.
 Для отримання метеореологічних даних обрано саме Open-Meteo API, оскільки він дозволяє робити запити без реєстрації та ключів.

- Розроблено клас OpenMeteoAPI для відправлення запиту до API за допомогою метода
   `getDailyMeasurements` що приймає діапазон дат та повертає спостереження в цьому діапазоні, на вказаних локаціях.
- Розроблено клас OpenMeteoDTO що відповідає структурі JSON файлу, яким відповідає 
   сервер.
- Розроблено клас OpenMeteoAPIMapper для створення 
   WeatherMeasurement з OpenMeteoDTO або JSON файлу.
   Цей клас використовує бібліотек `Gson` для парсингу JSON в OpenMeteoDTO
- Для спрощення написання запитів агрегацій, що працюють виключно з числовими значеннями було розроблено клас
   NumericWeatherAggregatorFactory,дозволяє писати запити агрегації за допомогою простого синтаксису.
- Для візуалізації даних розроблено клас HistogramPlotter, дозволяє
   малювати гістограми в консолі. Він приймає пари (ключ - числове значення), та будує гістограму за числовими 
   значеннями, підписуючи колонки ключами.

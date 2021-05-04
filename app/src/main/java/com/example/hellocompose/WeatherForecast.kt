package com.example.hellocompose

data class WeatherForecast(
    val summary: String,
    val description: String,
    val imageUrl: String = "https://picsum.photos/id/${(1..50).shuffled().first()}/200/300"
)

val DUMMY_WEATHER_FORECAST_VALUES = listOf<WeatherForecast>(
    WeatherForecast("Rainy/Windy", "90% chance of precipitation with strong winds. Expect strong winds in the late evening."),
    WeatherForecast("Light showers", "70% chance precipitation with a chance of hail. Expect strong winds briefly in the morning."),
    WeatherForecast("Scattered showers", "86% chance of light precipitation. The skies should clear up around midday."),
    WeatherForecast("Sunny", "A sunny day with 3% chance of precipitation. Expect clear skies and moderate temperatures."),
    WeatherForecast("Cloudy", "25% chance of precipitation with gentle winds. The skies should clear up around midday."),
    WeatherForecast("Cloudy", "13% chance of precipitation with gentle winds. Expect strong winds briefly in the morning."),
    WeatherForecast("Sunny/Windy", "A sunny day with 9% chance of precipitation. Expect strong winds in the late evening."),
    WeatherForecast("Rainy/Wind", "94% chance of precipitation with strong winds. Expect strong winds throughout the day."),
    WeatherForecast("Thunderstorm", "Scattered thunderstorms in the evening, then variable clouds overnight with more showers at times. Low 14C. Winds S at 15 to 25 km/h. Chance of rain 50%."),
    WeatherForecast("Sunny", "90% precipitation with strong winds. Expect strong winds in the late evening."),
    WeatherForecast("Hail", "Steady light rain and hail in the evening. Showers continuing late. Low near 10C. Winds SSE at 15 to 25 km/h. Chance of rain 70%."),
    WeatherForecast("Scattered thunderstorms", "Showers early then scattered thunderstorms developing later in the day. High 17C. Winds WNW at 10 to 15 km/h. Chance of rain 40%."),
    WeatherForecast("Rainy/Wind", "Rain showers early with mostly cloudy conditions later in the day. High 17C. Winds WNW at 15 to 25 km/h. Chance of rain 40%."),
    WeatherForecast("Rainy/Wind", "Cloudy with showers. Low 9C. Winds NW at 15 to 25 km/h. Chance of rain 40%."),
    WeatherForecast("Scattered Showers", "Showers early then scattered thunderstorms developing later in the day. High 24C. Winds SSW at 15 to 30 km/h. Chance of rain 40%"),
    WeatherForecast("Rainy/Wind", "Mostly cloudy with light rain early. High around 15C. Winds NNW at 15 to 25 km/h. Chance of rain 60%."),
    WeatherForecast("Sunny", "A sunny day with 3% chance of precipitation. Expect clear skies and moderate temperatures.")
)
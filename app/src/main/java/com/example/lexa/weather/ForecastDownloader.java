package com.example.lexa.weather;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions, extra parameters and static
 * helper methods.
 */
public class ForecastDownloader extends IntentService {
    private static final String ACTION_FETCH_16DAY_FORECAST = "com.example.lexa.weather.action.ACTION_GET_16DAY_FORECAST";

    private static final String EXTRA_CITY_NAME = "com.example.lexa.weather.extra.CITY_NAME";
    private static final String EXTRA_COUNT = "com.example.lexa.weather.extra.COUNT";

    public ForecastDownloader() {
        super("ForecastDownloader");
    }

    public static void startActionFetch16DayForecast(Context context, String cityName, int count) {
        Intent intent = new Intent(context, ForecastDownloader.class);
        intent.setAction(ACTION_FETCH_16DAY_FORECAST);
        intent.putExtra(EXTRA_CITY_NAME, cityName);
        intent.putExtra(EXTRA_COUNT, count);
        context.startService(intent);
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FETCH_16DAY_FORECAST.equals(action)) {
                final String cityName = intent.getStringExtra(EXTRA_CITY_NAME);
                final int count = intent.getIntExtra(EXTRA_COUNT, 1);
                handleActionFetch16DayForecast(cityName, count);
            }
        }
    }

    private void handleActionFetch16DayForecast(String cityName, int count) {

    }

}

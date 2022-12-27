package com.raphzam;

import com.raphzam.api.Book;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class RestApiApplication extends Application<RestApiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new RestApiApplication().run(args);
    }

    @Override
    public String getName() {
        return "RestApi";
    }

    @Override
    public void initialize(final Bootstrap<RestApiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final RestApiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}

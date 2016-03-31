/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.F3838284.myapplication.gcebackend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "jokeApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "gcebackend.myapplication.F3838284.example.com",
    ownerName = "gcebackend.myapplication.F3838284.example.com",
    packagePath=""
  )
)
public class JokesEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "putJoke")
    public JokesBean putJoke(JokesBean joke) {
        return joke;
    }

}

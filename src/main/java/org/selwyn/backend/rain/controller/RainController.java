package org.selwyn.backend.rain.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Selwyn on 9/30/15.
 */
@Controller
@RequestMapping("/rain")
public class RainController {

    @RequestMapping(method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity makeItRain() {
        return new ResponseEntity("Raining...", HttpStatus.OK);
    }
}

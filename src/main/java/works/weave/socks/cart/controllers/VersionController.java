package works.weave.socks.cart.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class VersionController {

   @Value("${version}")
   private String version;
   @Value("${backgroundcolor1}")
   private String backgroundcolor1;
   @Value("${backgroundcolor2}")
   private String backgroundcolor2;
   @Value("${welcomemessage}")
   private String welcomemessage;

   @ResponseStatus(HttpStatus.OK)
   @RequestMapping(method = RequestMethod.GET, path = "/version")
   public @ResponseBody String getVersion() {
      //return "Version = " + version;
      return "<html><head><center><font size=\"7\"><br /><br /><br />Welcome " + welcomemessage + "</font></center></head><body><center><font size=\"6\" style=\"background-color:" + backgroundcolor1 + "\"><br /><br /><br /><br />(Version </font>= <b><font size= \"6\" style=\"background-color:" + backgroundcolor2 + "\">" + version + ")</b></font></center></body></html>";
   }

}

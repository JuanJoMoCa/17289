package mx.uv.listi._9.Saludar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SaludarPlantilla {
    
    @GetMapping("/plantilla")
    public String plantilla(Model m){
        m.addAttribute("clave", "valor");
        return "xxx";
    }

    @GetMapping("/plantilla/{nombre}")
    public String plantilla2(@PathVariable String nombre, Model m){
        m.addAttribute("Persona", nombre);
        return "Plantilla.html";
    }

}
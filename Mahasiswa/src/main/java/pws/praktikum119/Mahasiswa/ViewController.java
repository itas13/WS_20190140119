package pws.praktikum119.Mahasiswa;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ViewController {
    @CrossOrigin
    @GetMapping(value="xml/datamahasiswa", produces ={
        MediaType.APPLICATION_XML_VALUE
        }
    )
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswa(){
    
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e){}
        
        return datamahasiswa;
    }
    
    
    @CrossOrigin
    @GetMapping(value="json/datamahasiswa", produces ={
        MediaType.APPLICATION_JSON_VALUE
        }
    )
    @ResponseBody
    public List<Datamahasiswa> getDataMahasiswayey(){
    
        List<Datamahasiswa> datamahasiswa = new ArrayList<>();
        
        DatamahasiswaJpaController controller = new DatamahasiswaJpaController();
        
        try{
            datamahasiswa = controller.findDatamahasiswaEntities();
        } catch (Exception e){}
        
        return datamahasiswa;
    }
}

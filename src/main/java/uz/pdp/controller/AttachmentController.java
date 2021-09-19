package uz.pdp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.pdp.model.AttachmentDto;
import uz.pdp.service.AttachmentService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/file")
public class AttachmentController {

   private final AttachmentService service;

    @Autowired
    public AttachmentController(AttachmentService service) {
        this.service = service;
    }


    @PostMapping("/upload")
    public ResponseEntity<?> upload(MultipartHttpServletRequest request) throws IOException {
        return service.uploadFiles(request);
    }

    @GetMapping("/get")
    public ResponseEntity<?> get() {
        return service.getList();
    }


    @GetMapping("/download/{id}")
    public void download(@PathVariable(value = "id")Long id, HttpServletResponse response) throws IOException {
        service.download(id,response);
    }


}

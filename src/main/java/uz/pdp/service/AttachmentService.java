package uz.pdp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface AttachmentService {
    ResponseEntity<?> uploadFiles(MultipartHttpServletRequest request) throws IOException;

    ResponseEntity<?> getList();

    void download(Long id, HttpServletResponse response);
}

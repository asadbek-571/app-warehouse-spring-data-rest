package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.domen.Attachment;

public interface AttachmentRepo extends JpaRepository<Attachment,Long> {
}

package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Summary;

public interface SummaryDao extends JpaRepository<Summary, Integer> {

}

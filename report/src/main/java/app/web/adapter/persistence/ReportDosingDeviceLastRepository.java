package app.web.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ReportDosingDeviceLastRepository extends JpaRepository<ReportDosingDeviceLastEntity, Long> {
}

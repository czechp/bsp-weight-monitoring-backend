package app.web.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface DosingDeviceLastRepository extends JpaRepository<DosingDeviceLastEntity, Long> {
}

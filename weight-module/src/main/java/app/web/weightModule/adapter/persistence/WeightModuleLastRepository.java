package app.web.weightModule.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface WeightModuleLastRepository extends JpaRepository<WeightModuleLastEntity, Long> {
}

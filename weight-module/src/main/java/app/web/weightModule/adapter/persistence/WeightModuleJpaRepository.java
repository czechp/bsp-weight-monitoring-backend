package app.web.weightModule.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface WeightModuleJpaRepository extends JpaRepository<WeightModuleEntity, Long> {
}

package app.web.adapter.persistence;

import app.web.application.port.crud.DosingDevicePortCRUD;
import app.web.domain.DosingDevice;
import app.web.domain.DosingDeviceFactory;
import app.web.domain.DosingDeviceFirst;
import app.web.domain.DosingDeviceLast;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
class DosingDevicePersistenceAdapterCRUD implements DosingDevicePortCRUD {
    private final DosingDeviceFirstRepository firstRepository;
    private final DosingDeviceLastRepository lastRepository;


    @Override
    public DosingDevice save(DosingDevice dosingDevice) {
        return dosingDevice instanceof DosingDeviceFirst
                ? saveFirstDosingDevice((DosingDeviceFirst) dosingDevice)
                : saveLastDosingDevice((DosingDeviceLast) dosingDevice);
    }

    private DosingDevice saveLastDosingDevice(DosingDeviceLast dosingDevice) {
        DosingDeviceLastEntity entity = DosingDeviceFactory.toEntity(dosingDevice);
        return DosingDeviceFactory.toDomain(lastRepository.save(entity));
    }

    private DosingDevice saveFirstDosingDevice(DosingDeviceFirst dosingDevice) {
        DosingDeviceFirstEntity entity = DosingDeviceFactory.toEntity(dosingDevice);
        return DosingDeviceFactory.toDomain(firstRepository.save(entity));
    }
}

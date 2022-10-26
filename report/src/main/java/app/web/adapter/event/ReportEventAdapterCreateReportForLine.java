package app.web.adapter.event;

import app.web.report.event.CreateReportForLineEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
class ReportEventAdapterCreateReportForLine implements ApplicationListener<CreateReportForLineEvent> {
    @Override
    public void onApplicationEvent(CreateReportForLineEvent event) {
        System.out.println("I'm here");
        System.out.println(event.getLineId());
    }
}

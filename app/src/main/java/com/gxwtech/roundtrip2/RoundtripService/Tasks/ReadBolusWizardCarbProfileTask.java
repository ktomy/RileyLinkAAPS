package com.gxwtech.roundtrip2.RoundtripService.Tasks;

import info.nightscout.androidaps.plugins.PumpCommon.hw.rileylink.service.data.ServiceResult;
import info.nightscout.androidaps.plugins.PumpCommon.hw.rileylink.service.data.ServiceTransport;
import info.nightscout.androidaps.plugins.PumpCommon.hw.rileylink.service.tasks.PumpTask;
import info.nightscout.androidaps.plugins.PumpMedtronic.comm.message.PumpMessage;
import info.nightscout.androidaps.plugins.PumpMedtronic.service.RileyLinkMedtronicService;

/**
 * Created by geoff on 7/10/16.
 */
@Deprecated
public class ReadBolusWizardCarbProfileTask extends PumpTask {
    public ReadBolusWizardCarbProfileTask() {
        super();
    }


    public ReadBolusWizardCarbProfileTask(ServiceTransport transport) {
        super(transport);
    }


    @Override
    public void run() {
        /*
        PumpMessage msg = RileyLinkMedtronicService.getCommunicationManager().getBolusWizardCarbProfile();
        ServiceResult result = getServiceTransport().getServiceResult();
        // interpret msg here.
        getServiceTransport().setServiceResult(result);
        */
    }
}

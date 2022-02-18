package com.anleper.savemoney.service.imlp;

import com.anleper.savemoney.dto.RevenueDto;
import com.anleper.savemoney.model.Revenue;
import com.anleper.savemoney.repository.RevenueRespository;
import com.anleper.savemoney.service.RevenueService;
import com.anleper.savemoney.supporter.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RevenueServiceImp  implements RevenueService{
    // @Autowired
    // private Converter converterSp;
    @Autowired
    private RevenueRespository revenueRespository;
    @Autowired
    private Converter converterRevenue;
    @Override
    public RevenueDto insertRevenue(RevenueDto revenueDto) {
        // converterSp.convertRevenueDtoToModel(revenueDto);
        // TODO Auto-generated method stub
        Revenue revenue = revenueRespository.findOneById(revenueDto.getId());
        System.out.println("data " + revenue.getNote() + revenue.getModifiedBy());
        return converterRevenue.toDto(revenue);
    }

    
}

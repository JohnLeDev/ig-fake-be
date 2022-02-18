package com.anleper.savemoney.supporter;

import com.anleper.savemoney.dto.RevenueDto;
import com.anleper.savemoney.model.Revenue;

import org.springframework.stereotype.Component;
@Component 
public class Converter {
    public Revenue convertRevenueDtoToModel(RevenueDto revenueDto){
        Revenue revenue = new Revenue();
        revenue.setRevenueMoney(revenue.getRevenueMoney());
        // revenue.setNote(revenueDto.getCategory());
        revenue.setId(revenue.getId());
        return revenue;
    }

    public RevenueDto toDto(Revenue revenue){
        RevenueDto revenueDto = new RevenueDto();
        revenueDto.setId(revenue.getId());
        return revenueDto;
    }
    // private
}

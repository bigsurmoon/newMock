package com.example.newMock.Model;

import lombok.*;

import java.math.BigDecimal;

@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class ResponseDTO {
    // В условии сказано, что всего 3 строки отдать надо (currency, balance, max limit), поэтому закомментил на всякий случай
    //private String rqUID;
    //private String clientId;
    //private String account;
    private String currency;
    private BigDecimal balance;
    private BigDecimal maxLimit;
}

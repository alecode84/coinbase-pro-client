package org.erc.coinbase.pro.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Data
public class Candle {

    public Candle( String[] array) {
//    [ time, low, high, open, close, volume ],
//    [ 1415398768, 0.32, 4.2, 0.35, 4.2, 12.3 ],
        Instant instant = Instant.ofEpochSecond(Long.parseLong(array[0]));

        startTime = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
        low = new BigDecimal( array[1]);
        high = new BigDecimal( array[2]);
        open = new BigDecimal( array[3]);
        close = new BigDecimal( array[4]);
        volume = new BigDecimal( array[5]);
    }

    private ZonedDateTime startTime;
    private BigDecimal low;
    private BigDecimal high;
    private BigDecimal open;
    private BigDecimal close;
    private BigDecimal volume;
}

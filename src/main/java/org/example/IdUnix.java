package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdUnix {
    private long unixTimestamp;

    public long id(){
        unixTimestamp = Instant.now().getEpochSecond();
        return unixTimestamp;
    }
}

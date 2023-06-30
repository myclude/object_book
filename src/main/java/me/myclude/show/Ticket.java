package me.myclude.show;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public class Ticket {

    private Long fee;

    public Long getFee() {
        return fee;
    }
}

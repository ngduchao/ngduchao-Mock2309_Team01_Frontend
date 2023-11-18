package com.vti.form.ticket;

import com.vti.entity.Ticket;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreatingTicketForm {
    private Integer quantity;
    private Integer total;
    private Integer creatorId;
    private Integer filmScheduleId;

    public Ticket toEntity() {
        return new Ticket(creatorId, filmScheduleId, quantity, total);
    }
}
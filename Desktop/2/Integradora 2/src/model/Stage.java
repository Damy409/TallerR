package model;

import java.util.Calendar;

public class Stage {
    
private TypeStage tipo;
private Calendar fechaInicioPlan;
private Calendar fechaFinPlan;
private Calendar fechaInicioReal;
private Calendar fechaFinReal;
private boolean approveStage;
private boolean activeStage;

    public Stage(TypeStage tipo,Calendar fechaInicioPlan,Calendar fechaFinPlan, Calendar fechaInicioReal, Calendar fechaFinReal,boolean approveStage,boolean activeStage) {

        this.tipo = tipo;
        this.fechaInicioPlan = fechaInicioPlan;
        this.fechaFinPlan = fechaFinPlan;
        this.fechaInicioReal = fechaInicioReal;
        this.fechaFinReal = fechaFinReal;
        this.approveStage = approveStage;
        this.activeStage = activeStage;

    }

    


}

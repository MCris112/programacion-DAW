package Activities.Activity9;

import com.darkredgm.querymc.Annotations.Primary;
import com.darkredgm.querymc.Annotations.DBForeign;
import com.darkredgm.querymc.Annotations.Column;
import com.darkredgm.querymc.Database.Model;

public class Edicion extends Model {

    @Primary
    @Column
    private int id;

    @Column
    private String fechaInicio;

    @Column
    private String fechaFin;

    @Column
    private String horario;

    @Column
    private String lugar;

    @DBForeign(model = Curso.class)
    @Column
    private int cursoId;

    @DBForeign(model = EmpleadoCapacitado.class)
    @Column
    private int empleadoId;

    public Edicion() {
    }

    public Edicion(String fechaInicio, String fechaFin, String horario, String lugar, int cursoId, EmpleadoCapacitado empleado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horario = horario;
        this.lugar = lugar;
        this.cursoId = cursoId;
        this.empleadoId = empleado.getId();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String getDatabaseName() {
        return "mcris_er_curso_empleado";
    }
}

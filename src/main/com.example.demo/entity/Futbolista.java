@Entity
@Table(name = "futbolistas")
public class Futbolista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String caracteristicas;

    @ManyToOne
    @JoinColumn(name = "posicion_id")
    private Posicion posicion;

    // Getters y Setters
}

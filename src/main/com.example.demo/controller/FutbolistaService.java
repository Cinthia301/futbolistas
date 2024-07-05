@RestController
@RequestMapping("/api")
public class FutbolistaController {
    private final FutbolistaService futbolistaService;

    public FutbolistaController(FutbolistaService futbolistaService) {
        this.futbolistaService = futbolistaService;
    }

    @GetMapping("/futbolista")
    public List<Futbolista> getAllFutbolistas() {
        return futbolistaService.getAllFutbolistas();
    }

    @GetMapping("/futbolista/{id}")
    public ResponseEntity<Futbolista> getFutbolistaById(@PathVariable Long id) {
        Optional<Futbolista> futbolista = futbolistaService.getFutbolistaById(id);
        return futbolista.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}

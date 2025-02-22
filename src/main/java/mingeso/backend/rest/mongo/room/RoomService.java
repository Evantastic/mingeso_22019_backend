package mingeso.backend.rest.mongo.room;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class RoomService {

  @Autowired
  private RoomRepository repository;

  public List<Room> getAll() {
    return repository.findAll();
  }

  public Room getById(String id) {
    return repository.findById(id).orElse(null);
  }
  // martes 15 octubre 2019
  public Room create(Room newRoom) {
    return repository.save(newRoom);
  }

  public Room delete(String id) {
    return repository.findById(id)
      .map( room -> {
        repository.deleteById(id);
        return room;
      })
      .orElse(null);
  }
}

import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {
  const [futbolistas, setFutbolistas] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:3001/futbolista')
      .then(response => {
        setFutbolistas(response.data);
      })
      .catch(error => {
        console.error("Hubo un error al obtener los datos de los futbolistas:", error);
      });
  }, []);

  return (
    <div className="App">
      <h1>Lista de Futbolistas</h1>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Fecha de Nacimiento</th>
            <th>Características</th>
            <th>Posición</th>
          </tr>
        </thead>
        <tbody>
          {futbolistas.map(futbolista => (
            <tr key={futbolista.id}>
              <td>{futbolista.id}</td>
              <td>{futbolista.nombres}</td>
              <td>{futbolista.apellidos}</td>
              <td>{futbolista.fechaNacimiento}</td>
              <td>{futbolista.caracteristicas}</td>
              <td>{futbolista.posicion}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
}

export default App;

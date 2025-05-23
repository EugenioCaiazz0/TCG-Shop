import { useEffect, useState } from "react";

function App() {
  const [videogiochi, setVideogiochi] = useState([]);
  const [loading, setLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetch("http://localhost:8080/api/videogiochi")
      .then((res) => {
        if (!res.ok) throw new Error("Errore nel caricamento");
        return res.json();
      })
      .then((data) => {
        setVideogiochi(data);
        setLoading(false);
      })
      .catch((err) => {
        setError(err.message);
        setLoading(false);
      });
  }, []);

  if (loading) return <p>Caricamento in corso...</p>;
  if (error) return <p>Errore: {error}</p>;

  return (
    <div>
      <h1>Lista Videogiochi</h1>
      <ul>
        {videogiochi.map((vg) => (
          <li key={vg.id}>
            {vg.titolo} - {vg.piattaforma} - {vg.genere} - {vg.annoUscita} - €{vg.prezzo}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;

import React from 'react';
import ReactDOM from 'react-dom';
import Painel from './componentes/painel';
import reportWebVitals from './reportWebVitals';

ReactDOM.render(
  <React.StrictMode>
    <Painel textoApp='Cadastros' />
  </React.StrictMode>,
  document.getElementById('root')
);

reportWebVitals();

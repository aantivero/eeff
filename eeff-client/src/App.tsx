import * as React from 'react';
import './App.css';
import EntidadList from './EntidadList';

const logo = require('./logo.svg');

class App extends React.Component<{}, any> {
    render() {
        return (
            <div className="App">
                <div className="App-header">
                    <img src={logo} className="App-logo" alt="logo"/>
                    <h2>Bienvenido</h2>
                </div>
                <EntidadList/>
            </div>

        );
    }
}

export default App;

import * as React from 'react';
import LogoImage from "./LogoImage";

class EntidadList extends React.Component<{}, any> {
    constructor(props: any) {
        super(props);

        this.state = {
            entidades: [],
            isLoading: false
        };
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('http://localhost:8080/entidades')
            .then(response => response.json())
            .then(data => this.setState({entidades: data, isLoading: false}));
    }

    render() {
        const {entidades, isLoading} = this.state;

        if(isLoading) {
            return <p>Cargando...</p>;
        }

        return (
            <div>
                <h2>Entidades Financieras</h2>
                {entidades.map((entidad: any) =>
                    <div key={entidad.id}>
                        {entidad.denominacion}<br/>
                        <LogoImage codigo={entidad.codigo} denominacion={entidad.denominacion}/>
                    </div>
                )}
            </div>
        );
    }
}

export default EntidadList;
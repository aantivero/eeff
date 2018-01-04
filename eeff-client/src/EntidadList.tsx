import * as React from 'react';

class EntidadList extends React.Component<{}, any> {
    constructor(props: any) {
        super(props);

        this.state = {
            bancos: [],
            isLoading: false
        };
    }

    componentDidMount() {
        this.setState({isLoading: true});

        fetch('http://localhost:8080/bancos')
            .then(response => response.json())
            .then(data => this.setState({bancos: data, isLoading: false}));
    }

    render() {
        const {bancos, isLoading} = this.state;

        if(isLoading) {
            return <p>Cargando...</p>;
        }

        return (
            <div>
                <h2>Entidades Financieras</h2>
                {bancos.map((banco: any) =>
                    <div key={banco.id}>
                        {banco.denominacion}
                    </div>
                )}
            </div>
        );
    }
}

export default EntidadList;
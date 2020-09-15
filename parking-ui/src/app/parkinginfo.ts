export interface ParkingInfo{
    id : string;
    nom: string;
    nbPlacesDispo: number;
    geometry: Geometry;
    nbPlacesTotal: number;
    statut: string;
    heureMaj: string;
}

export interface Geometry{
    type: string;
    coordinates: number[];
}
package missionmodel;

import gov.nasa.jpl.aerie.contrib.streamline.core.MutableResource;
import gov.nasa.jpl.aerie.contrib.streamline.modeling.Registrar;
import gov.nasa.jpl.aerie.contrib.streamline.modeling.discrete.Discrete;
import gov.nasa.jpl.aerie.contrib.serialization.mappers.DoubleValueMapper;

import static gov.nasa.jpl.aerie.contrib.streamline.core.MutableResource.resource;
import static gov.nasa.jpl.aerie.contrib.streamline.modeling.discrete.Discrete.discrete;

public class DataModel {

    public MutableResource<Discrete<Double>> RecordingRate; // Megabits/s

    public DataModel(Registrar registrar) {
        RecordingRate = resource(discrete(0.0));
        registrar.discrete("RecordingRate", RecordingRate, new DoubleValueMapper());
    }
}
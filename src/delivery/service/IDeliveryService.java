package delivery.service;

import delivery.dto.DeliveryDto;

import java.util.function.Function;

public interface IDeliveryService extends Function<DeliveryDto, Void> {
}

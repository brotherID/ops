package com.management.ovp.api;

import com.management.ovp.dtos.OrderDto;
import com.management.ovp.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zalando.problem.Problem;

import static org.zalando.problem.Status.NOT_FOUND;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value = "/order/{orderId}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable(name="orderId") String orderId){
        return  orderService.getOrderById(orderId)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> Problem.builder()
                        .withTitle("order n'existe pas")
                        .withStatus(NOT_FOUND)
                        .withDetail("Le order avec l'ID " + orderId + " n'a pas été trouvée.")
                        .build());
    }

    @PostMapping(value = "/order/")
    public  ResponseEntity<OrderDto> addOrder(@RequestBody  OrderDto orderDto){
        return  ResponseEntity.ok(orderService.addOrder(orderDto));
    }
}

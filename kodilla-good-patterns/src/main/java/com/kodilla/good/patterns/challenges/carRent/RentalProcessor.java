package com.kodilla.good.patterns.challenges.carRent;

public class RentalProcessor {

    private final InformationService informationService;
    private final CarRentalService rentalService;
    private final CarRentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final CarRentalService rentalService,
                           final CarRentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
        if (isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}
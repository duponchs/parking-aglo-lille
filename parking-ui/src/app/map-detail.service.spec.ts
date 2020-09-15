import { TestBed } from '@angular/core/testing';

import { MapDetailService } from './map-detail.service';

describe('MapDetailService', () => {
  let service: MapDetailService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MapDetailService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

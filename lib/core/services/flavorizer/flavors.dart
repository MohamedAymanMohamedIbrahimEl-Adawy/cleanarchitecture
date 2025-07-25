import 'package:flutter_dotenv/flutter_dotenv.dart';
import 'package:cleanarchitecture/core/global/enums/global_enum.dart';
import 'flavor_model.dart';

abstract class Flavor {
  FlavorModel get getCurrentFlavor;
}

class DevelopmentFlavor extends Flavor {
  @override
  FlavorModel get getCurrentFlavor =>
      FlavorModel()
        ..title = 'Development App'
        ..baseUrl = dotenv.env['BASE_URL_DEV']
        ..description = 'Development Flavor Egypt'
        ..androidBundleId = 'com.example.cleanarchitecture.dev'
        ..iosBundleId = 'com.example.cleanarchitecture.dev'
        ..flavorType = FlavorsTypes.dev;
}

class StageFlavor extends Flavor {
  @override
  FlavorModel get getCurrentFlavor =>
      FlavorModel()
        ..title = 'Stage App'
        ..baseUrl = dotenv.env['BASE_URL_STAGE']
        ..description = 'Stage Flavor Egypt'
        ..androidBundleId = 'com.example.cleanarchitecture.stage'
        ..iosBundleId = 'com.example.cleanarchitecture.stage'
        ..flavorType = FlavorsTypes.stage;
}

class ProductionFlavor extends Flavor {
  @override
  FlavorModel get getCurrentFlavor =>
      FlavorModel()
        ..title = 'Production App'
        ..baseUrl = dotenv.env['BASE_URL_PROD']
        ..description = 'Production Flavor'
        ..androidBundleId = 'com.example.cleanarchitecture'
        ..iosBundleId = 'com.example.cleanarchitecture'
        ..flavorType = FlavorsTypes.prod;
}

class EnterpriseFlavor extends Flavor {
  @override
  FlavorModel get getCurrentFlavor =>
      FlavorModel()
        ..title = 'Enterprise App'
        ..baseUrl = dotenv.env['BASE_URL_ENTER']
        ..description = 'Enterprise Flavor'
        ..androidBundleId = 'com.example.cleanarchitecture.enterprise'
        ..iosBundleId = 'com.example.cleanarchitecture.enterprise'
        ..flavorType = FlavorsTypes.enterprise;
}

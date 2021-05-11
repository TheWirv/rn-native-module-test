import { requireNativeComponent, ViewStyle } from 'react-native';

type RnNativeModuleTestProps = {
  color: string;
  style: ViewStyle;
};

export const RnNativeModuleTestViewManager = requireNativeComponent<RnNativeModuleTestProps>(
'RnNativeModuleTestView'
);

export default RnNativeModuleTestViewManager;

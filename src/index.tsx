import {requireNativeComponent} from 'react-native';
// Types
import type {ViewStyle} from 'react-native';
import type {PropsWithChildren} from 'react';

type OnChangeFocusViewProps = PropsWithChildren<{
  onBlur?: () => void;
  onFocus?: () => void;
  style?: ViewStyle;
}>;

export const OnChangeFocusView =
  requireNativeComponent<OnChangeFocusViewProps>('OnChangeFocusView');

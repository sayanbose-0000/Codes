import Octicons from "@expo/vector-icons/Octicons";
import { View } from "react-native";

const TabIcon = ({ tab, focused }: { tab: any; focused: boolean; }) => {
  return (
    <View className="flex-1 justify-center items-center">
      <Octicons name={tab.icon as any} color={focused ? "#f3b24f" : "#515151"} size={20} className="mt-2" />
    </View>
  );
};

export default TabIcon;

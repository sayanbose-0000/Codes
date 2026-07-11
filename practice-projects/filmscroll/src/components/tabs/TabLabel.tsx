import { Text } from "react-native";

const TabLabel = ({ tab, focused }: { tab: any; focused: boolean; }) => {
  return (
    <Text className={`${focused ? "text-accent font-bold" : "text-disabled"} text-xs text-center`}>
      {tab.title}
    </Text>
  );
};

export default TabLabel;

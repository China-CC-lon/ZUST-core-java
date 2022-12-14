package adf.core.agent.action.fire;

import adf.core.agent.action.Action;
import javax.annotation.Nonnull;
import rescuecore2.messages.Message;
import rescuecore2.standard.messages.AKRest;
import rescuecore2.worldmodel.EntityID;

public class ActionRefill extends Action {

  public ActionRefill() {
    super();
  }


  @Override
  @Nonnull
  public String toString() {
    return "ActionRefill []";
  }


  @Override
  @Nonnull
  public Message getCommand(@Nonnull EntityID agentID, int time) {
    return new AKRest(agentID, time);
  }
}